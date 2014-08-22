;Special Restrictions
;class
;type
;Class
;vector?
;sequential?
;list?
;seq?
;map?
;set?
;instance?
;getClass

(defn bbt [s]
  (letfn [(is-vector? [s] (= '(:b :a :a) (let [[e0 e1 e2] (reverse (conj s :a :a :b))] [e0 e1 e2])))
          (is-list?   [s] (= '(:b :a :a) (let [[e0 e1 e2] (conj s :a :a :b)] [e0 e1 e2])))
          (is-set?    [s] (= (count (conj s :a)) (count (conj s :a :a))))
          (is-map?    [s] (= (count (conj s {:a 1})) (count (conj s {:a 1} {:a 2}))))]
    (cond
      (is-map? s)    :map
      (is-set? s)    :set
      (is-vector? s) :vector
      (is-list? s)   :list
      :else          :unknown)))


(= :map (bbt {:a 1, :b 2}))

(= :list (bbt (range (rand-int 20))))

(= :vector (bbt [1 2 3 4 5 6]))

(= :set (bbt #{10 (rand-int 5)}))

(= [:map :set :vector :list] (map bbt [{} #{} [] ()]))