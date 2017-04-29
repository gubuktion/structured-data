(ns structured-data)

(defn do-a-thing [x]
  (let
    [double-x (+ x x)]
    (Math/pow double-x double-x)))

(defn spiff [v]
  (+ (get v 0) (get v 2)))

(defn cutify [v]
  (conj v "<3"))

(defn spiff-destructuring [v]
  (let
    [[a b c] v]
    (+ a c)
    ))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

;(defn width [rectangle]
;  (let [[[x1 y1] [x2 y2]] rectangle]
;    (cond
;      (< (- x1 x2) 0) (* (- x1 x2) -1)
;      :else (- x1 x2))))

(defn width [rectangle]
  (let [[[x1 _] [x2 _]] rectangle]
    (Math/abs (- x1 x2))))

(defn height [rectangle]
  (let [[[_ y1] [_ y2]] rectangle]
    (Math/abs (- y1 y2))))

;(defn height [rectangle]
;  (let [[[x1 y1] [x2 y2]] rectangle]
;    (cond
;      (< (- y1 y2) 0) (* (- y1 y2) -1)
;      :else (- y1 y2))))

(defn square? [rectangle]
  (if (= (width rectangle) (height rectangle)) true false))

(defn area [rectangle]
  (* (width rectangle) (height rectangle)))

(defn contains-point? [rectangle point]
  (let [[[x1 y1] [x2 y2]] rectangle
        [x y] point]
    (and (<= (min x1 x2) x (max x1 x2))
         (<= (min y1 y2) y (max y1 y2)))))


;(defn contains-rectangle? [outer inner]
;  (let [[[x1 y1] [x2 y2]] outer [[x3 y3] [x4 y4]] inner]
;    (cond (and (<= x1 x3 x4 x2) (<= y1 y3 y4 y2)) true
;          (and (<= x1 x4 x3 x2) (<= y1 y4 y3 y2)) true
;          (and (<= x2 x3 x4 x1) (<= y2 y3 y4 y1)) true
;          (and (<= x2 x4 x3 x1) (<= y2 y3 y4 y1)) true
;          :else false)))

(defn contains-rectangle? [outer inner]
  (let [[p1 p2] inner]
    (and (contains-point? outer p1)
         (contains-point? outer p2))))

(defn title-length [book]
  (count (:title book)))

(defn author-count [book]
  (count (:authors book)))

(defn multiple-authors? [book]
  (> (author-count book) 1))

(defn add-author [book new-author]
  :-)
;1234

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
